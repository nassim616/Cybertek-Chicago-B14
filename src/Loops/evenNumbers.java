package Loops;

public class evenNumbers {

    public static void main(String[] args) {

//        Change the loops so that they print only the even numbers between
//        1 and 20, that is, 2 4 6 8 10 12 14 16 18 20.
//
//        for (int i = 1; i <= 20; i++) {
//
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//
//            }
//        }
//    }
//    }
//
//int i = 1;
//
//  while (i<=20){
//       i++;
//      if (i%5==1){
//          System.out.print(i + " ");
//      }
//   }
//   }
//   }
////        Change the loops so that they print those numbers divisible by 3, that is, 3 6 9 12 15 18.
//
//for ( int i = 1 ; i <= 20 ; i++){
//    if (i%3==1){
//        System.out.println(i + " ");
//    }
//
//    }
//}
//           Change the loops so that they print the square of each odd number,
//           that is, 1 9 25 49 81 121 169 225 289 361.
//
//        for (int i = 0; i <= 20; i++) {
//
//         if ( i %2 == 1){
//
//             System.out.print(i * i + " ");
//         }
//        }
//        }
//    }


//        Change the loops so that they print all 20 numbers with plus signs between them and a blank on either side,
//        but with no plus sign at the end,
//                that is, 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20.


        for (int i = 1; i <= 20; i++) {
            System.out.print(i);
            if (i < 20) {

                System.out.print(" + ");

            }
        }
    }
}


