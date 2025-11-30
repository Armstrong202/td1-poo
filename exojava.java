import java.util.Scanner;

class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre N : ");
        int N = sc.nextInt();
        System.out.println("Comptage de 1 à " + N + " :");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Entrez un chiffre : ");
        int chiffre = sc.nextInt();
        if (chiffre % 2 == 0) {
            System.out.println("Nombre pair");
            for (int i = 0; i < 10; i++) {
                System.out.print((chiffre + i * 2) + " ");
            }
        } else {
            System.out.println("Nombre impair");
            for (int i = 0; i < 10; i++) {
                System.out.print((chiffre + i * 2) + " ");
            }
        }
        System.out.println();
    }
}

class Exercice8 {
    public static void main(String[] args) {
        System.out.println("Multiples de 5 jusqu'à 50 :");
        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = sc.nextInt();
        System.out.print("Entrez la limite max : ");
        int max = sc.nextInt();
        System.out.println("Multiples de " + nombre + " jusqu'à " + max + " :");
        for (int i = nombre; i <= max; i += nombre) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Exercice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbAleatoire = (int) (Math.random() * 10 + 1);
        int essais = 0;
        int saisie;
        System.out.println("Devinez le nombre (entre 1 et 10) :");
        while (true) {
            saisie = sc.nextInt();
            essais++;
            if (saisie == nbAleatoire) {
                break;
            }
            System.out.println("Raté, essayez encore !");
        }
        System.out.println("Bravo ! Vous avez trouvé en " + essais + " essais.");
    }
}

class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un verbe : ");
        String verbe = sc.nextLine().toLowerCase();
        if (verbe.endsWith("er")) {
            System.out.println("C'est un verbe du 1er groupe.");
        } else if (verbe.endsWith("ir")) {
            System.out.println("C'est un verbe du 2ème groupe.");
        } else if (verbe.endsWith("oir") || verbe.endsWith("oire")) {
            System.out.println("C'est un verbe du 3ème groupe.");
        } else {
            System.out.println("Verbe non reconnu.");
        }
    }
}

class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();
        int longueur = phrase.length();
        if (longueur < 20) {
            System.out.println("Phrase courte");
        } else if (longueur < 50) {
            System.out.println("Phrase moyenne");
        } else {
            System.out.println("Phrase longue");
        }
    }
}

class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = sc.nextLine();
        char premiere = mot.charAt(0);
        char derniere = mot.charAt(mot.length() - 1);
        int nbLettres = mot.length();
        System.out.println("Première lettre : " + premiere);
        System.out.println("Dernière lettre : " + derniere);
        System.out.println("Nombre de lettres : " + nbLettres);
    }
}

class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine();
        System.out.print("Entrez votre prénom : ");
        String prenom = sc.nextLine();
        String nomMaj = nom.toUpperCase();
        String prenomFormat = prenom.substring(0,1).toUpperCase() + prenom.substring(1).toLowerCase();
        System.out.println(nomMaj + " (" + nomMaj.length() + ")");
        System.out.println(prenomFormat + " (" + prenomFormat.length() + ")");
    }
}

class Exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();
        if (phrase.length() > 10) {
            String coupe = phrase.substring(0, 10) + "...";
            System.out.println(coupe);
        } else {
            System.out.println(phrase);
        }
    }
}

class Exercice6Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine();
        System.out.print("Entrez votre prénom : ");
        String prenom = sc.nextLine();
        String nomMaj = nom.toUpperCase();
        System.out.println(nomMaj + " (" + nomMaj.replace("'", "").length() + ")");
        String[] parties = prenom.split("-");
        StringBuilder prenomFormat = new StringBuilder();
        for (int i = 0; i < parties.length; i++) {
            String p = parties[i];
            prenomFormat.append(p.substring(0,1).toUpperCase()).append(p.substring(1).toLowerCase());
            if (i < parties.length - 1) {
                prenomFormat.append("-");
            }
        }
        System.out.println(prenomFormat + " (" + prenomFormat.length() + ")");
    }
}

class Exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = sc.nextLine().toLowerCase();
        String inverse = new StringBuilder(mot).reverse().toString();
        if (mot.equals(inverse)) {
            System.out.println("C'est un palindrome !");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }
    }
}

class FigureGeometrique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        while (choix != 7) {
            System.out.println("=== Menu Figures Géométriques ===");
            System.out.println("1. Carré (plein)");
            System.out.println("2. Carré (creux)");
            System.out.println("3. Triangle (plein, aligné à gauche)");
            System.out.println("4. Triangle (creux, aligné à gauche)");
            System.out.println("5. Pyramide (plein, centrée)");
            System.out.println("6. Pyramide (creuse, centrée)");
            System.out.println("7. Quitter");
            System.out.print("Tapez le numéro de votre choix : ");
            choix = lireEntier(sc);
            if (choix >= 1 && choix <= 6) {
                System.out.print("Entrez le nombre de lignes (>= 1) : ");
                int n = lireEntier(sc);
                System.out.println();
                switch (choix) {
                    case 1 -> carrePlein(n);
                    case 2 -> carreCreux(n);
                    case 3 -> triangleGauchePlein(n);
                    case 4 -> triangleGaucheCreux(n);
                    case 5 -> pyramidePleine(n);
                    case 6 -> pyramideCreuse(n);
                }
                System.out.println();
            } else if (choix == 7) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Choix invalide.\n");
            }
        }
    }

    private static int lireEntier(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Veuillez entrer un entier valide : ");
        }
        return sc.nextInt();
    }

    private static void carrePlein(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print("*");
            System.out.println();
        }
    }

    private static void carreCreux(int n) {
        if (n <= 1) {
            carrePlein(n);
            return;
        }
        ligneEtoiles(n);
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) System.out.print(" ");
            System.out.println("*");
        }
        ligneEtoiles(n);
    }

    private static void triangleGauchePlein(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    private static void triangleGaucheCreux(int n) {
        if (n <= 2) {
            triangleGauchePlein(n);
            return;
        }
        System.out.println("*");
        for (int i = 2; i <= n - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < i - 2; j++) System.out.print(" ");
            System.out.println("*");
        }
        for (int j = 0; j < n; j++) System.out.print("*");
        System.out.println();
    }

    private static void pyramidePleine(int n) {
        for (int i = 1; i <= n; i++) {
            int espaces = n - i;
            int etoiles = 2 * i - 1;
            printEspaces(espaces);
            for (int j = 0; j < etoiles; j++) System.out.print("*");
            System.out.println();
        }
    }

    private static void pyramideCreuse(int n) {
        if (n <= 2) {
            pyramidePleine(n);
            return;
        }
        printEspaces(n - 1);
        System.out.println("*");
        for (int i = 2; i <= n - 1; i++) {
            int espacesGauche = n - i;
            int espacesInterieur = 2 * i - 3;
            printEspaces(espacesGauche);
            System.out.print("*");
            printEspaces(espacesInterieur);
            System.out.println("*");
        }
        printEspaces(0);
        ligneEtoiles(2 * n - 1);
    }

    private static void ligneEtoiles(int count) {
        for (int i = 0; i < count; i++) System.out.print("*");
        System.out.println();
    }

    private static void printEspaces(int count) {
        for (int i = 0; i < count; i++) System.out.print(" ");
    }
}

class Tirage1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choisissez un nombre entre 1 et 100 : ");
        int cible = sc.nextInt();
        int tirage, coups = 0;
        do {
            tirage = 1 + (int)(Math.random() * 100);
            coups++;
        } while (tirage != cible);
        System.out.println("Nombre trouvé en " + coups + " tirages aléatoires.");
    }
}

class Tirage2 {
    public static void main(String[] args) {
        int coups = 0;
        boolean trouve = false;
        while (!trouve) {
            int a = (int)(Math.random() * 1000);
            int b = (int)(Math.random() * 1000);
            int c = (int)(Math.random() * 1000);
            coups++;
            System.out.println(a + "," + b + "," + c);
            if (a % 2 == 0 && b % 2 != 0 && c % 2 != 0) {
                trouve = true;
                System.out.println("Résultat obtenu en " + coups + " coups.");
            }
        }
    }
}

class Tableaux {
    public static void main(String[] args) {
        int[] tabInt = new int[10];
        int[] tabPair = new int[10];
        int[] tabImpair = new int[10];
        int somme = 0, produit = 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int indexPair = 0, indexImpair = 0;
        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = (int)(Math.random() * 101);
        }
        System.out.print("Tableau : ");
        for (int val : tabInt) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int val : tabInt) {
            somme += val;
            produit *= val;
            if (val < min) min = val;
            if (val > max) max = val;
            if (val % 2 == 0) {
                tabPair[indexPair++] = val;
            } else {
                tabImpair[indexImpair++] = val;
            }
        }
        System.out.println("Somme = " + somme);
        System.out.println("Produit = " + produit);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.print("Pairs : ");
        for (int i = 0; i < indexPair; i++) System.out.print(tabPair[i] + " ");
        System.out.println();
        System.out.print("Impairs : ");
        for (int i = 0; i < indexImpair; i++) System.out.print(tabImpair[i] + " ");
        System.out.println();
    }
}
