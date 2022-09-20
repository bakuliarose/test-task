package kg.megacom.testtask.microservices.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private String fileName;
    private String downloadUri;
    private String fileType;
    private long size;


    public String getFileName() {
        return this.fileName;
    }

    public String getDownloadUri() {
        return this.downloadUri;
    }

    public String getFileType() {
        return this.fileType;
    }

    public long getSize() {
        return this.size;
    }

    public Response() {
    }
}
