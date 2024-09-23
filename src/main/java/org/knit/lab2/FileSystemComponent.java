package org.knit.lab2;
import java.util.ArrayList;
import java.util.List;


public abstract class FileSystemComponent {
    protected String name;
    public FileSystemComponent(String name) {
        this.name = name;
    }
    public abstract int getSize();

    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public abstract void display(String indent);
}


class File extends FileSystemComponent {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void display(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
}


class Folder extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    public void display(String indent) {
        System.out.println(indent + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }
}

