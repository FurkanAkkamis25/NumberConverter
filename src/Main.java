
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Dönüşüm için gerekli seçimleri kullanıcıdan iste
                System.out.println("Dönüştürmek istediğiniz sayının formatını seçin:");
                System.out.println("1. Binary");
                System.out.println("2. Decimal");
                System.out.println("3. Octal");
                System.out.println("4. Hexadecimal");
                System.out.print("Seçiminizi girin (1-4): ");
                int inputType = scanner.nextInt();

                scanner.nextLine(); // Boş karakteri tüketmek için

                // Kullanıcıdan dönüştürülecek sayıyı al
                System.out.print("Dönüştürülecek sayıyı girin: ");
                String inputNumber = scanner.nextLine();

                // Hangi formata dönüştürüleceğini seç
                System.out.println("Dönüştürmek istediğiniz formatı seçin:");
                System.out.println("1. Binary");
                System.out.println("2. Decimal");
                System.out.println("3. Octal");
                System.out.println("4. Hexadecimal");
                System.out.print("Seçiminizi girin (1-4): ");
                int outputType = scanner.nextInt();

                // Girdiye göre dönüşüm yap
                switch (inputType) {
                    case 1: // Binary
                        convertFromBinary(inputNumber, outputType);
                        break;
                    case 2: // Decimal
                        convertFromDecimal(inputNumber, outputType);
                        break;
                    case 3: // Octal
                        convertFromOctal(inputNumber, outputType);
                        break;
                    case 4: // Hexadecimal
                        convertFromHexadecimal(inputNumber, outputType);
                        break;
                    default:
                        System.out.println("Geçersiz seçim!");
                }

                scanner.close();
            }

            // Binary formatından dönüşüm fonksiyonu
            private static void convertFromBinary(String input, int outputType) {
                int decimal = Integer.parseInt(input, 2); // Binary'i decimal'e çevir

                switch (outputType) {
                    case 1:
                        System.out.println("Binary: " + input);
                        break;
                    case 2:
                        System.out.println("Decimal: " + decimal);
                        break;
                    case 3:
                        System.out.println("Octal: " + Integer.toOctalString(decimal));
                        break;
                    case 4:
                        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                        break;
                    default:
                        System.out.println("Geçersiz çıktı formatı seçimi!");
                }
            }

            // Diğer dönüşüm fonksiyonları benzer şekilde tanımlanabilir
            private static void convertFromDecimal(String input, int outputType) {
                int decimal = Integer.parseInt(input);

                switch (outputType) {
                    case 1:
                        System.out.println("Binary: " + Integer.toBinaryString(decimal));
                        break;
                    case 2:
                        System.out.println("Decimal: " + decimal);
                        break;
                    case 3:
                        System.out.println("Octal: " + Integer.toOctalString(decimal));
                        break;
                    case 4:
                        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                        break;
                    default:
                        System.out.println("Geçersiz çıktı formatı seçimi!");
                }
            }

            private static void convertFromOctal(String input, int outputType) {
                int decimal = Integer.parseInt(input, 8);

                switch (outputType) {
                    case 1:
                        System.out.println("Binary: " + Integer.toBinaryString(decimal));
                        break;
                    case 2:
                        System.out.println("Decimal: " + decimal);
                        break;
                    case 3:
                        System.out.println("Octal: " + input);
                        break;
                    case 4:
                        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                        break;
                    default:
                        System.out.println("Geçersiz çıktı formatı seçimi!");
                }
            }

            private static void convertFromHexadecimal(String input, int outputType) {
                int decimal = Integer.parseInt(input, 16);

                switch (outputType) {
                    case 1:
                        System.out.println("Binary: " + Integer.toBinaryString(decimal));
                        break;
                    case 2:
                        System.out.println("Decimal: " + decimal);
                        break;
                    case 3:
                        System.out.println("Octal: " + Integer.toOctalString(decimal));
                        break;
                    case 4:
                        System.out.println("Hexadecimal: " + input.toUpperCase());
                        break;
                    default:
                        System.out.println("Geçersiz çıktı formatı seçimi!");
                }
            }
        }


