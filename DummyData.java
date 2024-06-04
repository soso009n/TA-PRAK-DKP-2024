package util;

import model.Narapidana;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DummyData {
    
    private static List<Narapidana> prisoners = new ArrayList<>();

    // Metode untuk menambahkan narapidana baru
    public static void addPrisoner(Narapidana prisoner) {
        prisoners.add(prisoner);
    }

    // Metode untuk menghapus narapidana
    public static void removePrisoner(Narapidana prisoner) {
        prisoners.remove(prisoner);
    }

    public static Narapidana getPrisonerByName(String name) {
        for (Narapidana prisoner : prisoners) {
            if (prisoner.getNamaLengkap().equals(name)) {
                return prisoner;
            }
        }
        return null; // Jika tidak ditemukan narapidana dengan nama yang cocok
    }

    // Metode untuk mendapatkan narapidana berdasarkan kategori dan jenis
    public static List<Narapidana> getPrisoners(String category, String type) {
        switch (category) {
            case "Laki-Laki":
                return getMalePrisonersByType(type);
            case "Perempuan":
                return getFemalePrisonersByType(type);
            case "Anak-Anak":
                return getChildPrisonersByType(type);
            default:
                return new ArrayList<>();
        }
    }

    // Metode untuk mendapatkan narapidana berdasarkan jenis untuk narapidana pria
    private static List<Narapidana> getMalePrisonersByType(String type) {
        switch (type) {
            case "Sedang":
                return getMaleMediumPrisoners();
            case "Berat":
                return getMaleHeavyPrisoners();
            case "Ringan":
            default:
                return getMaleLightPrisoners();
        }
    }

    // Metode untuk mendapatkan narapidana berdasarkan jenis untuk narapidana wanita
    private static List<Narapidana> getFemalePrisonersByType(String type) {
        switch (type) {
            case "Sedang":
                return getFemaleMediumPrisoners();
            case "Berat":
                return getFemaleHeavyPrisoners();
            case "Ringan":
            default:
                return getFemaleLightPrisoners();
        }
    }

    // Metode untuk mendapatkan narapidana berdasarkan jenis untuk narapidana anak-anak
    private static List<Narapidana> getChildPrisonersByType(String type) {
        switch (type) {
            case "Sedang":
                return getChildMediumPrisoners();
            case "Berat":
                return getChildHeavyPrisoners();
            case "Ringan":
            default:
                return getChildLightPrisoners();
        }
    }

    // Existing methods for male prisoners
    public static List<Narapidana> getMaleLightPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        prisoners.add(new Narapidana("Adam Johnson", "Adam", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Brandon Lee", "Brandon", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Christopher Davis", "Chris", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("David Smith", "Dave", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Edward Wilson", "Eddie", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Frank Johnson", "Frankie", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("George Smith", "Georgie", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Harry Davis", "Harry", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Ian Johnson", "Ian", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("James Smith", "Jimmy", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Kevin Wilson", "Kev", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Leonard Davis", "Leo", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Michael Johnson", "Mike", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Nathan Smith", "Nate", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Oliver Davis", "Ollie", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Patrick Johnson", "Pat", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Quentin Smith", "Quinn", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Robert Davis", "Rob", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Steven Johnson", "Steve", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Thomas Smith", "Tom", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Ulysses Davis", "Uly", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Victor Johnson", "Vic", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("William Smith", "Will", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
        prisoners.add(new Narapidana("Xavier Davis", "X", 35, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Yohan Johnson", "Yoyo", 30, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
        prisoners.add(new Narapidana("Zack Smith", "Zack", 25, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
        e.printStackTrace();
        }
    return prisoners;
    }


    public static List<Narapidana> getMaleMediumPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Adam Taylor", "Adam", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Brandon Adams", "Brandon", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Christopher Wilson", "Chris", 34, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("David Taylor", "Dave", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Edward Adams", "Eddie", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Frank Wilson", "Frankie", 34, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("George Taylor", "Georgie", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Harry Adams", "Harry", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ian Wilson", "Ian", 34, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("James Taylor", "Jimmy", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Kevin Adams", "Kev", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Leonard Wilson", "Leo", 34, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Michael Taylor", "Mike", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Nathan Adams", "Nate", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Oliver Wilson", "Ollie", 34, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Patrick Taylor", "Pat", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Quentin Adams", "Quinn", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Robert Wilson", "Rob", 34, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Steven Taylor", "Steve", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Thomas Adams", "Tom", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ulysses Wilson", "Uly", 34, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Victor Taylor", "Vic", 40, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
        e.printStackTrace();
        }
    return prisoners;
    }

    public static List<Narapidana> getMaleHeavyPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Adam Scott", "Adam", 45, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Brandon Lee", "Brandon", 50, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Christopher Harris", "Chris", 55, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("David Scott", "Dave", 45, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Edward Lee", "Eddie", 50, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Frank Harris", "Frankie", 55, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("George Scott", "Georgie", 45, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Harry Lee", "Harry", 50, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ian Harris", "Ian", 55, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("James Scott", "Jimmy", 45, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Kevin Lee", "Kev", 50, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Leonard Harris", "Leo", 55, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Michael Scott", "Mike", 45, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Nathan Lee", "Nate", 50, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Oliver Harris", "Ollie", 55, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Patrick Scott", "Pat", 45, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Quentin Lee", "Quinn", 50, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Robert Harris", "Rob", 55, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Steven Scott", "Steve", 45, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Thomas Lee", "Tom", 50, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ulysses Harris", "Uly", 55, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
        e.printStackTrace();
        }
    return prisoners;
    }

    // Existing methods for female prisoners
    public static List<Narapidana> getFemaleLightPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Alice Doe", "Alice", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Bethany Smith", "Beth", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Catherine Brown", "Cathy", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Daisy Doe", "Daisy", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Ella Smith", "Ella", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Fiona Brown", "Fiona", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Grace Doe", "Grace", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Hannah Smith", "Hannah", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Isabel Brown", "Isabel", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Jessica Doe", "Jess", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Kelly Smith", "Kelly", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Lily Brown", "Lily", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Megan Doe", "Meg", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Natalie Smith", "Nat", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Olivia Brown", "Liv", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Penelope Doe", "Penny", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Quinn Smith", "Quinn", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Rachel Brown", "Rae", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Sarah Doe", "Sara", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Tiffany Smith", "Tiff", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ursula Brown", "Ursi", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Victoria Doe", "Vicky", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Wendy Smith", "Wendy", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Xena Brown", "Xena", 32, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Yvonne Doe", "Yvie", 28, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Zoe Smith", "Zo", 24, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
        e.printStackTrace();
        }
    return prisoners;
    }

    public static List<Narapidana> getFemaleMediumPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Abigail Taylor", "Abby", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Bella Adams", "Bella", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Clara Wilson", "Clara", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Daphne Taylor", "Daphne", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Eleanor Adams", "Ellie", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Fiona Wilson", "Fiona", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Gabriella Taylor", "Gaby", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Hannah Adams", "Hannah", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Isabella Wilson", "Izzy", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Jessica Taylor", "Jess", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Katherine Adams", "Kat", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Lillian Wilson", "Lily", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Mia Taylor", "Mia", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Natalie Adams", "Nat", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Olivia Wilson", "Liv", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Penelope Taylor", "Penny", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Quinn Adams", "Quinn", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Rachel Wilson", "Rae", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Sophia Taylor", "Sophie", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Tiffany Adams", "Tiff", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ursula Wilson", "Ursi", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Victoria Taylor", "Vicky", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Wendy Adams", "Wendy", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Xena Wilson", "Xena", 30, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Yvonne Taylor", "Yvie", 35, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Zara Adams", "Zara", 29, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
        e.printStackTrace();
        }
    return prisoners;
    }

    public static List<Narapidana> getFemaleHeavyPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Alice Scott", "Ali", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Bianca Lee", "Bee", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Cynthia Harris", "Cyn", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Daisy Scott", "Dai", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Emma Lee", "Em", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Fiona Harris", "Fifi", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Grace Scott", "Gracie", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Hazel Lee", "Haz", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ivy Harris", "Ivy", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Jasmine Scott", "Jaz", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Kimberly Lee", "Kim", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Lily Harris", "Lil", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Megan Scott", "Meg", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Nora Lee", "Nor", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Olivia Harris", "Ollie", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Piper Scott", "Pip", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Quinn Lee", "Q", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Rose Harris", "Rosie", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Samantha Scott", "Sam", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Tara Lee", "Taz", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Uma Harris", "Um", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Violet Scott", "Vi", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Wendy Lee", "Wen", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Xena Harris", "Xen", 50, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Yvonne Scott", "Yvy", 40, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Zoey Lee", "Z", 45, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
        e.printStackTrace();
        }
    return prisoners;
    }

    // Existing methods for child prisoners
    public static List<Narapidana> getChildLightPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Adam Smith", "Adam", 16, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Benjamin Johnson", "Ben", 15, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Christopher Brown", "Chris", 17, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Daniel Davis", "Dan", 16, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Edward Martinez", "Eddie", 15, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Frank Harris", "Frankie", 17, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("George Thompson", "Georgie", 16, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Henry Clark", "Hank", 15, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Isaac Baker", "Ike", 17, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Jack Cooper", "Jack", 16, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Kevin Gray", "Kev", 15, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Liam Sanchez", "Lee", 17, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Michael Perez", "Mike", 16, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Nathan Rivera", "Nate", 15, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Oscar Martin", "Oz", 17, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Patrick Hall", "Pat", 16, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Quentin Stewart", "Quin", 15, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Robert Cook", "Rob", 17, 3, "Perusakan", sdf.parse("01-04-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Samuel Murphy", "Sam", 16, 6, "Pencurian", sdf.parse("01-01-2023"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Thomas Reed", "Tom", 15, 12, "Penipuan", sdf.parse("01-01-2022"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
        e.printStackTrace();
        }
        return prisoners;
    }

    public static List<Narapidana> getChildMediumPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Adam Taylor", "Adam", 16, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Benjamin Adams", "Ben", 15, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Christopher Wilson", "Chris", 17, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Daniel Taylor", "Dan", 16, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Edward Adams", "Eddie", 15, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Franklin Wilson", "Frankie", 17, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("George Taylor", "George", 16, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Henry Adams", "Hank", 15, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Isaac Wilson", "Ike", 17, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Jack Taylor", "Jack", 16, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Kevin Adams", "Kev", 15, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Liam Wilson", "Lee", 17, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Michael Taylor", "Mike", 16, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Nathan Adams", "Nate", 15, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Oliver Wilson", "Ollie", 17, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Peter Taylor", "Pete", 16, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Quentin Adams", "Quin", 15, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Robert Wilson", "Rob", 17, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    prisoners.add(new Narapidana("Samuel Taylor", "Sam", 16, 24, "Pemalsuan", sdf.parse("01-01-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Thomas Adams", "Tom", 15, 18, "Pencucian uang", sdf.parse("01-07-2021"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ulysses Wilson", "Lee", 17, 15, "Korupsi", sdf.parse("01-04-2022"), sdf.parse("01-07-2023")));
    } catch (Exception e) {
            e.printStackTrace();
        }
        return prisoners;
    }

    public static List<Narapidana> getChildHeavyPrisoners() {
    List<Narapidana> prisoners = new ArrayList<>();
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    prisoners.add(new Narapidana("Andrew Scott", "Andy", 16, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Brian Lee", "Bri", 15, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Carl Harris", "Carl", 17, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("David Scott", "Dave", 16, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Edward Lee", "Ed", 15, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Frank Harris", "Frank", 17, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("George Scott", "George", 16, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Henry Lee", "Hank", 15, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Isaac Harris", "Ike", 17, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Jack Scott", "Jack", 16, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Kevin Lee", "Kev", 15, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Liam Harris", "Lee", 17, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Michael Scott", "Mike", 16, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Nathan Lee", "Nate", 15, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Oliver Harris", "Ollie", 17, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Peter Scott", "Pete", 16, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Quentin Lee", "Quin", 15, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Robert Harris", "Rob", 17, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Samuel Scott", "Sam", 16, 60, "Pembunuhan", sdf.parse("01-01-2018"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Thomas Lee", "Tom", 15, 36, "Terorisme", sdf.parse("01-01-2019"), sdf.parse("01-01-2023")));
    prisoners.add(new Narapidana("Ulysses Harris", "Lee", 17, 48, "Penyelundupan narkoba", sdf.parse("01-01-2020"), sdf.parse("01-01-2023")));
    } catch (Exception e) {
            e.printStackTrace();
        }
        return prisoners;
    }

    
    
}
