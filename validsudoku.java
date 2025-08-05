import java.util.HashSet;
public class validsudoku {
        public static boolean isValidSudoku(char[][] board) {
            // Create HashSets for rows, columns, and 3x3 boxes
            HashSet<Character>[] rows = new HashSet[9];
            HashSet<Character>[] cols = new HashSet[9];
            HashSet<Character>[] boxes = new HashSet[9];

            for (int i = 0; i < 9; i++) {
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
            }

            // Traverse the board
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char c = board[i][j];

                    // Skip empty cells
                    if (c == '.') continue;

                    // Check row
                    if (rows[i].contains(c)) return false;
                    rows[i].add(c);

                    // Check column
                    if (cols[j].contains(c)) return false;
                    cols[j].add(c);

                    // Check 3x3 box
                    int boxIndex = (i / 3) * 3 + (j / 3); // Maps (i, j) to box index 0–8
                    if (boxes[boxIndex].contains(c)) return false;
                    boxes[boxIndex].add(c);
                }
            }

            return true;
        }

        public static void main(String[] args) {
            char[][] board = {
                    {'5','3','.','.','7','.','.','.','.'},
                    {'6','.','.','1','9','5','.','.','.'},
                    {'.','9','8','.','.','.','.','6','.'},
                    {'8','.','.','.','6','.','.','.','3'},
                    {'4','.','.','8','.','3','.','.','1'},
                    {'7','.','.','.','2','.','.','.','6'},
                    {'.','6','.','.','.','.','2','8','.'},
                    {'.','.','.','4','1','9','.','.','5'},
                    {'.','.','.','.','8','.','.','7','9'}
            };

            System.out.println("Is the Sudoku board valid? " + isValidSudoku(board));
        }
    }


