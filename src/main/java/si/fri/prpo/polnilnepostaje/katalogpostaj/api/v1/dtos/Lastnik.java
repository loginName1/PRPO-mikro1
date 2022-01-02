package si.fri.prpo.polnilnepostaje.katalogpostaj.api.v1.dtos;

public class Lastnik {
    private Long id;
    private String ime_uporabnika;
    private String priimek_uporabnika;
    private String un_uporabnika;
    private String telefon_uporabnika;
    private String mail_uporabnika;
    private String pass_uporabnika;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getIme() {return ime_uporabnika;}
    public void setIme(String s) {this.ime_uporabnika = s;}
    public String getPriimek() {return priimek_uporabnika;}
    public void setPriimek(String s) {this.priimek_uporabnika = s;}
    public String getUn() {return un_uporabnika;}
    public void setUn(String s) {this.un_uporabnika = s;}
    public String getTel() {return telefon_uporabnika;}
    public void setTel(String s) {this.telefon_uporabnika = s;}
    public String getMail() {return mail_uporabnika;}
    public void setMail(String s) {this.mail_uporabnika = s;}
    public String getPass() {return pass_uporabnika;}
    public void setPass(String pass) {this.pass_uporabnika = pass;}
}
