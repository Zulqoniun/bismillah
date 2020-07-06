package com.imamfarisi.myalquran;

public class Item {

    private Integer id, databaseId, suratId, verseId;
    private String ayatText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getSuratId() {
        return suratId;
    }

    public void setSuratId(Integer suratId) {
        this.suratId = suratId;
    }

    public Integer getVerseId() {
        return verseId;
    }

    public void setVerseId(Integer verseId) {
        this.verseId = verseId;
    }

    public String getAyatText() {
        return ayatText;
    }

    public void setAyatText(String ayatText) {
        this.ayatText = ayatText;
    }
}
