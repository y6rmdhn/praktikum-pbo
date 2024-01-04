package MiniProjectGameTicTacToe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TicTacToeGUI extends JFrame implements ActionListener {

    private int xScore, oScore, moveCounter;

    private boolean isPlayerOne;

    private JLabel turnLabel, scoreLabel, resultLabel;
    private JButton[][] board;
    private JDialog resultDialog;

    public TicTacToeGUI(){
        super("TicTacToe Game");
        setSize(CommonConstants.FRAME_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(CommonConstants.BACKGROUND_COLOR);

        //INIT VARS
        createResultDialog();

        board = new JButton[3][3];

        //PLAYER X STARTS FIRST
        isPlayerOne = true;

        addGuiComponent();
    }

    private void addGuiComponent(){
        //BAR LABEL
        JLabel barLabel = new JLabel();
        barLabel.setOpaque(true);
        barLabel.setBackground(CommonConstants.BAR_COLOR);
        barLabel.setBounds(0, 0, CommonConstants.FRAME_SIZE.width, 25);

        //TURN LABEL
        turnLabel = new JLabel(CommonConstants.X_LABEL);
        turnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        turnLabel.setFont(new Font("Dialog", Font.PLAIN, 40));
        turnLabel.setPreferredSize(new Dimension(100, turnLabel.getPreferredSize().height));
        turnLabel.setOpaque(true);
        turnLabel.setBackground(CommonConstants.X_COLOR);
        turnLabel.setForeground(CommonConstants.BOARD_COLOR);
        turnLabel.setBounds(
                (CommonConstants.FRAME_SIZE.width - turnLabel.getPreferredSize().width)/2,
                0,
                turnLabel.getPreferredSize().width,
                turnLabel.getPreferredSize().height
        );

        //SCORE LABEL
        scoreLabel = new JLabel(CommonConstants.SCORE_LABEL);
        scoreLabel.setFont(new Font("Dialog", Font.PLAIN, 40));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setForeground(CommonConstants.BOARD_COLOR);
        scoreLabel.setBounds(0,
                turnLabel.getY() + turnLabel.getPreferredSize().height + 25,
                CommonConstants.FRAME_SIZE.width,
                scoreLabel.getPreferredSize().height
        );

        //GAME BBOARD
        GridLayout gridLayout = new GridLayout(3,3);
        JPanel boardPanel = new JPanel(gridLayout);
        boardPanel.setBounds(0,
                scoreLabel.getY() + scoreLabel.getPreferredSize().height + 35,
                CommonConstants.BOARD_SIZE.width,
                CommonConstants.BOARD_SIZE.height
        );

        //CREATE BOARD
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                JButton button = new JButton();
                button.setFont(new Font("Dialog", Font.PLAIN, 180));
                button.setPreferredSize(CommonConstants.BUTTON_SIZE);
                button.setBackground(CommonConstants.BACKGROUND_COLOR);
                button.addActionListener(this);
                button.setBorder(BorderFactory.createLineBorder(CommonConstants.BOARD_COLOR));

                //ADD BUTTON TO BOARD
                board[i][j] = button;
                boardPanel.add(board[i][j]);
            }
        }

        //RESET BUTTON
        JButton resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Dialog", Font.PLAIN, 24));
        resetButton.addActionListener(this);
        resetButton.setBackground(CommonConstants.BOARD_COLOR);
        resetButton.setPreferredSize(new Dimension(100, 30));
        resetButton.setBounds(
                (CommonConstants.FRAME_SIZE.width - resetButton.getPreferredSize().width) / 2 - 10,
                CommonConstants.FRAME_SIZE.height - 100,
                resetButton.getPreferredSize().width,
                resetButton.getPreferredSize().height
        );

        getContentPane().add(turnLabel);
        getContentPane().add(barLabel);
        getContentPane().add(scoreLabel);
        getContentPane().add(boardPanel);
        getContentPane().add(resetButton);
    }

    private void createResultDialog(){
        resultDialog = new JDialog();
        resultDialog.getContentPane().setBackground(CommonConstants.BACKGROUND_COLOR);
        resultDialog.setResizable(false);
        resultDialog.setTitle("Result");
        resultDialog.setSize(CommonConstants.RESULT_DIALOG_SIZE);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setModal(true);
        resultDialog.setLayout(new GridLayout(2, 1));
        resultDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                resetGame();
            }
        });

        //RESULT LABEL
        resultLabel = new JLabel();
        resultLabel.setFont(new Font("Dialog", Font.BOLD, 18));
        resultLabel.setForeground(CommonConstants.BOARD_COLOR);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //RESTART BUTTON
        JButton restartButton = new JButton("Play Again");
        restartButton.setBackground(CommonConstants.BOARD_COLOR);
        restartButton.addActionListener(this);

        resultDialog.add(resultLabel);
        resultDialog.add(restartButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Reset") || command.equals("Play Again")){
            //RESET THE GAME
            resetGame();

            //HANYA RESET SKOR KETIKA PENCET RESET
            if(command.equals("Reset"))
                xScore = oScore = 0;

            if(command.equals("Play Again"))
                resultDialog.setVisible(false);


        }else{
            //PLAYER MOVE
            JButton button = (JButton) e.getSource();
            if(button.getText().equals("")){
                moveCounter++;

                //TANDAI TOMBOL DENGAN X/O
                if(isPlayerOne){
                    //PLAYER ONE (X PLAYER)
                    button.setText(CommonConstants.X_LABEL);
                    button.setForeground(CommonConstants.X_COLOR);

                    //UPDATE TURN LABEL
                    turnLabel.setText(CommonConstants.O_LABEL);
                    turnLabel.setBackground(CommonConstants.O_COLOR);

                    //UPDATE TURN
                    isPlayerOne = false;
                }else{
                    //PLAYER TWO (O PLAYER)
                    button.setText(CommonConstants.O_LABEL);
                    button.setForeground(CommonConstants.O_COLOR);

                    //UPDATE TURN LABEL
                    turnLabel.setText(CommonConstants.X_LABEL);
                    turnLabel.setBackground(CommonConstants.X_COLOR);

                    //UPDATE TURN
                    isPlayerOne = true;
                }

                //CHECK WIN CONDIION
                if(isPlayerOne){
                    //periksa untuk melihat apakah langkah terakhir dari O adalah langkah yang menang
                    checkOWin();
                }{
                    //periksa untuk melihat apakah langkah terakhir dari X adalah langkah yang menang
                    checkXWin();
                }

                //CHECK FOR DRAW CONDITIONS
                checkDraw();

                //UPDATE SCORE LABEL
                scoreLabel.setText("X: "+xScore+" | O: "+oScore);
            }

            repaint();
            revalidate();
        }
    }

    private void checkXWin(){
        String result = "X wins!";

        //CHECK ROWS
        for(int row = 0; row < board.length; row++){
            if(board[row][0].getText().equals("X") && board[row][1].getText().equals("X") && board[row][2].getText().equals("X")){
                resultLabel.setText(result);

                //DISPLAY RESULT DIALOG
                resultDialog.setVisible(true);

                //UPDATE SCORE
                xScore++;
            }
        }

        //CHECK COLUMNS
        for(int col = 0; col < board.length; col++){
            if(board[0][col].getText().equals("X") && board[1][col].getText().equals("X") && board[2][col].getText().equals("X")){
                resultLabel.setText(result);

                //DISPLAY RESULT DIALOG
                resultDialog.setVisible(true);

                //UPDATE SCORE
                xScore++;
            }
        }

        //CEK DIAGONAL
        if(board[0][0].getText().equals("X") && board[1][1].getText().equals("X") && board[2][2].getText().equals("X")){
            resultLabel.setText(result);

            //DISPLAY RESULT DIALOG
            resultDialog.setVisible(true);

            //UPDATE SCORE
            xScore++;
        }

        if(board[2][0].getText().equals("X") && board[1][1].getText().equals("X") && board[0][2].getText().equals("X")){
            resultLabel.setText(result);

            //DISPLAY RESULT DIALOG
            resultDialog.setVisible(true);

            //UPDATE SCORE
            xScore++;
        }
    }

    private void checkOWin(){
        String result = "O wins!";

        //CHECK ROWS
        for(int row = 0; row < board.length; row++){
            if(board[row][0].getText().equals("O") && board[row][1].getText().equals("O") && board[row][2].getText().equals("O")){
                resultLabel.setText(result);

                //DISPLAY RESULT DIALOG
                resultDialog.setVisible(true);

                //UPDATE SCORE
                oScore++;
            }
        }

        //CHECK COLUMNS
        for(int col = 0; col < board.length; col++){
            if(board[0][col].getText().equals("O") && board[1][col].getText().equals("O") && board[2][col].getText().equals("O")){
                resultLabel.setText(result);

                //DISPLAY RESULT DIALOG
                resultDialog.setVisible(true);

                //UPDATE SCORE
                oScore++;
            }
        }

        //CEK DIAGONAL
        if(board[0][0].getText().equals("O") && board[1][1].getText().equals("O") && board[2][2].getText().equals("O")){
            resultLabel.setText(result);

            //DISPLAY RESULT DIALOG
            resultDialog.setVisible(true);

            //UPDATE SCORE
            oScore++;
        }

        if(board[2][0].getText().equals("O") && board[1][1].getText().equals("O") && board[0][2].getText().equals("O")){
            resultLabel.setText(result);

            //DISPLAY RESULT DIALOG
            resultDialog.setVisible(true);

            //UPDATE SCORE
            oScore++;
        }
    }


    private void checkDraw(){
        //JIKA TOTAL 0 GERAKAN DAN BELUM ADA PEMAIN YANG MENANG, BERARTI ADA SERI
        if(moveCounter >= 9){
            resultLabel.setText("Draw!");
            resultDialog.setVisible(true);
        }

    }

    private void resetGame(){
        //RESET PLAYER BACK TO X_PLAYER
        isPlayerOne = true;
        turnLabel.setText(CommonConstants.X_LABEL);
        turnLabel.setBackground(CommonConstants.X_COLOR);

        //RESET SCORE DISPLAY
        scoreLabel.setText(CommonConstants.SCORE_LABEL);

        //RESET MOVE COUNTER
        moveCounter = 0;


        //RESET BOARD
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j].setText("");
            }
        }
    }
}
