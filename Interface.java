public interface Interface<T> {
    public boolean isEpmty();

    public void insertDepan(T data);
    public void insertBelakang(T data);
    public void insertTengah(T data, int key);

    public void hapusDepan();
    public void hapusBelakang();
    public void hapusTengah(int key2);

    public void tampilDepan();
    public void tampilBelakang();
    public void tampilJuara();
}
