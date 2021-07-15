package com.heinzelman.pdf_repo.controller;

import com.heinzelman.pdf_repo.forms.FilesForm;
import com.heinzelman.pdf_repo.service.JoinPDFs;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;


@Controller
public class FileController {

    private String homepath = "c:/Users/admin/Desktop/SYSTEM/";


    @RequestMapping(value = {"/add","/",""} , method = RequestMethod.GET )
    public String addFile ( Model model ){
        return "add";
    }

    @RequestMapping(value = {"/add"} , method = RequestMethod.POST )
    public String addFile ( Model model, FilesForm form ) throws IOException {

        if ( form.getCode()==null || form.getCode().trim().toUpperCase().equals("")) { model.addAttribute("error_" , " *** brak kodu *** " ) ; return  addFile ( model ); }

        String code = form.getCode();
        if ( form.getPdfA()!= null && !form.getPdfA().isEmpty()) { saveFile (  code , form.getPdfA(), "A" , model); }
        if ( form.getPdfAL()!= null && !form.getPdfAL().isEmpty()) { saveFile (  code , form.getPdfAL(), "AL" , model ); }
        if ( form.getPdfB()!= null && !form.getPdfB().isEmpty()) { saveFile (  code , form.getPdfB(), "B" , model ); }
        if ( form.getPdfBL()!= null && !form.getPdfBL().isEmpty()) { saveFile (  code , form.getPdfBL(), "BL" , model ); }


        JoinPDFs j = new JoinPDFs();
        j.join( homepath + code + "/" + code + "_" + "AL" + ".pdf"  , homepath + code + "/" + code + "_" + "A" + ".pdf"  );
        
        
        return "add";
    }


    private void saveFile ( String code , MultipartFile filePath , String suffix , Model model ) {

        File theDir = new File(  homepath + code  ); if (!theDir.exists()){ theDir.mkdirs(); }

        try (InputStream in = filePath.getInputStream();
            OutputStream out = new FileOutputStream( homepath + code + "/" + code + "_" + suffix + ".pdf" ); ) {
            IOUtils.copy(in, out);
        } catch (Exception ex) {
            model.addAttribute("error", model.getAttribute("error") + "\n" + ex);
        }
        model.addAttribute("result", model.getAttribute("\nloaded file " + code + "_" + suffix ) );
    }
}
