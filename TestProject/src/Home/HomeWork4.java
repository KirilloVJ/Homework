package Home;

import java.util.Random;
import java.util.Scanner;


public class HomeWork4 {
   public static Random random = new Random();
   public static Scanner scanner = new Scanner(System.in);

   public static final int PlayerMoveUp = 8;
   public static final int PlayerMoveDown = 2;
   public static final int PlayerMoveLeft = 4;
   public static final int PlayerMoveRight = 6;

   public static char player = '@';
   public static int playerHP = 100;
   public static int playerStr = 20;
   public static int playerCoin = 0;
   public static int playerExp = 0;
   public static int playerScore = 0;
   public static int playerX;
   public static int playerY;

   public static char EmptyCell = '_';

   public static char[][] map;
   public static int mapH;
   public static int mapW;
   public static int MinMap = 5;
   public static int MaxMap = 5;



   public static char Enemy = 'E';
   public static int enemyHP;
   public static int enemyStr;
   public static int EnemyValueMax = 40;
   public static int EnemyValueMin = 20;
   public static int EnemyCount;

   public static char Coin = '$';
   public static int CashCoin;
   public static int CashMin = 20;
   public static int CashMax = 40;
   public static int CoinCount;


   public static int GameLevel = 0;

   public static void main(String[] args) {
      while (LivePlayer()){
         ++GameLevel;
         System.out.println("Start game level " + GameLevel );
         System.out.println("Player HP " + playerHP );
         System.out.println("Player Cash " + playerCoin );
         LevleCycle();
      }
      System.out.println("Game over Player Score " + playerScore + " Player cash " + playerCoin);
   }
   public static void LevleCycle(){

      CreatedMap();
      CreatedPlayer();
      SpawnEnemy();
      SpawnCoins();

      while (true) {
         PrintMap();
         PlayerMove();
         if (!LivePlayer()) {
            System.out.println("Player is dead. Game over");
            break;
         }
         if (!EnemyExist()) {
            System.out.println("Player win. player score " + playerScore + "Player Cash " + playerCoin + ". Level finish");
            break;
         }
      }


      PrintMap();
      System.out.println("Game over");
      System.out.println("=================");


   }

   public static void CreatedMap() {
      mapW = randomValue(MinMap, MaxMap);
      mapH = randomValue(MinMap, MaxMap);
      map = new char[mapH][mapW];
      for (int y = 0; y < mapH; y++) {
         for (int x = 0; x < mapW; x++) {
            map[y][x] = EmptyCell;
         }

      }
      System.out.println("Map has been created " + mapH + "x" + mapW);
   }

   public static void CreatedPlayer() {
      playerX = randomValue(0, mapW - 1);
      playerY = randomValue(0, mapH - 1);
      map[playerY][playerX] = player;
      System.out.println("Player has been created " + (playerX + 1) + "x" + (playerY + 1));

   }

   public static void SpawnEnemy() {
      EnemyCount = randomValue(1, 4);

      enemyStr = randomValue(EnemyValueMin, EnemyValueMax);
      enemyHP = randomValue(EnemyValueMin, EnemyValueMax);


      int enemyPosX;
      int enemyPosY;

      for (int i = 1; i <= EnemyCount; i++) {

         do {
            enemyPosX = random.nextInt(mapH);
            enemyPosY = random.nextInt(mapW);
         } while (!isEmptyCell(enemyPosX, enemyPosY));
         map[enemyPosY][enemyPosX] = Enemy;
      }
      System.out.println("Enemies has been created. Count is " + EnemyCount);
   }

   public static void PlayerMove() {
      int playerLastX = playerX;
      int playerLastY = playerY;

      int playerDestination;
      do {


         System.out.print("Enter your destination: UP(" + PlayerMoveUp +
                 ") | DOWN(" + PlayerMoveDown +
                 ") | LEFT(" + PlayerMoveLeft +
                 ") | RIGHT(" + PlayerMoveRight + ") > ");
         playerDestination = scanner.nextInt();
         switch (playerDestination) {
            case PlayerMoveUp:
               playerY -= 1;
               break;
            case PlayerMoveDown:
               playerY += 1;
               break;
            case PlayerMoveRight:
               playerX += 1;
               break;
            case PlayerMoveLeft:
               playerX -= 1;
               break;
         }
      } while (!ValidMove(playerX, playerY, playerLastX, playerLastY));

      PlayerNextCellChek();


      map[playerLastY][playerLastX] = EmptyCell;
      map[playerY][playerX] = player;

   }
   public static void SpawnCoins(){
      CoinCount = randomValue(1, 3);
      CashCoin = randomValue(10, 20);
      int coinPosX;
      int coinPosY;

      for (int i = 1; i <= CoinCount; i++) {

         do {
            coinPosX = random.nextInt(mapH);
            coinPosY = random.nextInt(mapW);
         } while (!isEmptyCell(coinPosX, coinPosY));
         map[coinPosY][coinPosX] = Coin;
      }
      System.out.println("Coin has been created. Count is " + CoinCount);



   }
   public static void PlayerNextCellChek(){
      if (map[playerY][playerX] == Enemy){
         playerHP -= enemyStr;
         playerScore++;
         EnemyCount--;
         System.out.println("Player has been attack on " + enemyStr + ". Player HP " + playerHP);
      }
      if (map[playerY][playerX] == Coin){
         playerCoin += CashCoin;
         playerScore++;
         CoinCount--;
         System.out.println("Player cash " + playerCoin);
      }

   }

   public static int randomValue(int min, int max) {
      return min + random.nextInt(max - min + 1);
   }

   public static void PrintMap() {
      System.out.println("===== MAP =====");
      for (int y = 0; y < mapH; y++) {
         for (int x = 0; x < mapW; x++) {
            System.out.print(map[y][x] + "|");
         }
         System.out.println();
      }
      System.out.println("===== MAP =====");
   }

   public static boolean LivePlayer() {
      return playerHP > 0;
   }

   public static boolean isEmptyCell(int x, int y) {
      return map[y][x] == EmptyCell;
   }

   public static boolean ValidCell(int x, int y) {
      return x >= 0 && x < mapW && y >= 0 && y < mapH;
   }
   public static boolean ValidMove(int nextCellX, int nextCellY, int LastCellX, int LastCellY) {
      if (ValidCell(nextCellX, nextCellY)) {
         System.out.println("Player move to [" + (nextCellX + 1) + ":" + (nextCellY + 1) + "]");
         return true;
      } else {
         System.out.println("Invalid move");
         playerX = LastCellX;
         playerY = LastCellY;
      }
      return false;
   }
   public static boolean EnemyExist(){
      return EnemyCount > 0;
   }

}





