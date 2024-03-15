public class Data {
    private String namaMataKuliah;
    private String namaTugas;
    private String deadlineTugas;
    
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }
    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }
    public String getNamaTugas() {
        return namaTugas;
    }
    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }
    public String getDeadlineTugas() {
        return deadlineTugas;
    }
    public void setDeadlineTugas(String deadlineTugas) {
        this.deadlineTugas = deadlineTugas;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + namaMataKuliah + ", Nama Tugas = " + namaTugas + ", Deadline Tugas = "
                + deadlineTugas;
    }
    public Data(String namaMataKuliah, String namaTugas, String deadlineTugas) {
        this.namaMataKuliah = namaMataKuliah;
        this.namaTugas = namaTugas;
        this.deadlineTugas = deadlineTugas;
    }
}