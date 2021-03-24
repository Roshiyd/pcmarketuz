package pdp.uz.pcmarketuz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import pdp.uz.pcmarketuz.payload.Result;
import pdp.uz.pcmarketuz.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;


    @PostMapping
    public Result uploadFile(MultipartHttpServletRequest request) throws IOException {
        return attachmentService.uploadAttachment(request);
    }

    @GetMapping("/downlaod/{id}")
    public void downloadFile(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentService.downloadAttachment(id, response);
    }
}
