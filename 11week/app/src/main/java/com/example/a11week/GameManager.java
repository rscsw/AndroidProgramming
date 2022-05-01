package com.example.a11week;

public class GameManager {

    // 0: 게임 종료 - 무승부
    // 1: 게임 종료 - X 승리
    // 2: 게임 종료 - O 승리
    // 3: 게임 중 - X 턴
    // 4: 게임 중 - O 턴
    public int gameState;
    public int[] map;
    int t;

    GameManager()
    {
        gameState = 0;
        map = new int[9];
    }

    public void Init()
    {
        t = 0;
        gameState = 3;
        for(int a = 0; a < 9; a++)
        {
            map[a] = 0;
        }
    }

    public void Update()
    {
        if(gameState == 3)
            gameState = 4;
        else if(gameState == 4)
            gameState = 3;

        // X 승리
        if(map[0] == 1 && map[1] == 1 && map[2] == 1)
        {
            gameState = 1;
        }
        else if(map[3] == 1 && map[4] == 1 && map[5] == 1)
        {
            gameState = 1;
        }
        else if(map[6] == 1 && map[7] == 1 && map[8] == 1)
        {
            gameState = 1;
        }
        else if(map[0] == 1 && map[3] == 1 && map[6] == 1)
        {
            gameState = 1;
        }
        else if(map[1] == 1 && map[4] == 1 && map[7] == 1)
        {
            gameState = 1;
        }
        else if(map[2] == 1 && map[5] == 1 && map[8] == 1)
        {
            gameState = 1;
        }
        else if(map[0] == 1 && map[4] == 1 && map[8] == 1)
        {
            gameState = 1;
        }
        else if(map[2] == 1 && map[4] == 1 && map[6] == 1)
        {
            gameState = 1;
        }

        // O 승리
        else if(map[0] == 2 && map[1] == 2 && map[2] == 2)
        {
            gameState = 2;
        }
        else if(map[3] == 2 && map[4] == 2 && map[5] == 2)
        {
            gameState = 2;
        }
        else if(map[6] == 2 && map[7] == 2 && map[8] == 2)
        {
            gameState = 2;
        }
        else if(map[0] == 2 && map[3] == 2 && map[6] == 2)
        {
            gameState = 2;
        }
        else if(map[1] == 2 && map[4] == 2 && map[7] == 2)
        {
            gameState = 2;
        }
        else if(map[2] == 2 && map[5] == 2 && map[8] == 2)
        {
            gameState = 2;
        }
        else if(map[0] == 2 && map[4] == 2 && map[8] == 2)
        {
            gameState = 2;
        }
        else if(map[2] == 2 && map[4] == 2 && map[6] == 2)
        {
            gameState = 2;
        }

        //무승부
        else if(t >= 9) gameState = 0;
    }
}
