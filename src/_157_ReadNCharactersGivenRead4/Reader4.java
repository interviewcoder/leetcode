package _157_ReadNCharactersGivenRead4;

public class Reader4 {
    
    private char[] _contents;
    
    private int _offset;
    
    private static final int READ_SIZE = 4;

    public Reader4() {
        _contents = null;
        _offset = 0;
    }
    
    public void setContents(char[] contents) {
        this._contents = contents;
    }
    
    public int read4(char[] buf) {
        int sz = Math.min(_contents.length - _offset, READ_SIZE);
        for (int i = 0; i < sz; i++) {
            buf[i] = _contents[_offset + i];
        }
        _offset += sz;
        return sz;
    }
    
}
