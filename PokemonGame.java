//
//import java.util.Scanner;
//
//class Pokemon{
//    public int count = 0;
//    protected String owner;
//    protected String skills;
//    public Pokemon() {}
//    public Pokemon(String owner, String skills){
//            this.owner = owner;
//            this.skills = skills;
//            count = count + 1;
//    }
//    public void info(){
//        System.out.printf("%s의 포켓몬이 사용 가능한 스킬", owner);
//        System.out.printf("%s",skills);
//    }
//
//    public void attack(){
//        System.out.printf("%s 공격 시전!", skills);
//    }
//
//}
//
//class Pikachu extends Pokemon{
//    protected String name;
//
//    public  Pikachu(String owner, String skills, String name){
//        super(owner, skills);
//        this.name =name;
//        System.out.printf("%s", name);
//    }
//
//    public void attack(){
//        System.out.printf("[삐까삐까] %s의 %s가 %s 공격시전!", owner, name, skills);
//    }
//
//}
//
//class Ggoboogi extends Pokemon{
//    protected String name;
//
//    public  Ggoboogi(String owner, String skills, String name){
//        super(owner, skills);
//        this.name =name;
//        System.out.printf("%s", name);
//    }
//
//    public void attack(){
//        System.out.printf("[꼬북꼬북] %s의 %s가 %s 공격시전!", owner, name, skills);
//    }
//
//    public void swim(){
//        System.out.printf("%s가 수영을 합니다", name);
//    }
//}
//
//class Pairi extends Pokemon{
//    protected String name;
//
//    public  Pairi(String owner, String skills, String name){
//        super(owner, skills);
//        this.name =name;
//        System.out.printf("%s", name);
//    }
//
//    public void attack(){
//        System.out.printf("[파이리리리] %s의 %s가 %s 공격 시전!", owner, name, skills);
//    }
//
//}
//
//public class PokemonGame {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int menu, p= 0;
//        String n,s = null;
//        while(true) {
//            System.out.printf("총 %s 마리의 포켓몬이 생성되었습니다", Pokemon.count);
//            System.out.printf("1) 포켓몬 생성  2) 프로그램 종료 : ");
//            menu = sc.nextInt();
//            if (menu == 2) {
//                System.out.print("프로그램을 종료합니다");
//                break;
//            }
//            else if (menu == 1) {
//                System.out.print("1)피카츄 2)꼬부기 3)파이리");
//                p = sc.nextInt();
//                System.out.print("플레이어 이름 입력:");
//                n = sc.nextLine();
//                System.out.print("사용 가능한 기술 입력");
//                s = sc.nextLine();
//
//
//            }
//        }
//
//
//         Pokemon fire = new Pokemon();
//
//    }
//}
