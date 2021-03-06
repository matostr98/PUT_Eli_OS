package filesystem;

public class File {
    private String name;
    private String extension;
    private int size;
    private int indexBlock;

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] splitName = name.split("[.]");
        this.name = name;
        this.extension = splitName[1];
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndexBlock() {
        return indexBlock;
    }

    public void setIndexBlock(int indexBlock) {
        this.indexBlock = indexBlock;
    }
}

