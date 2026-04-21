public class TicTacToe {

    public static void main(String[] args) {
        int slot = 7;

        int[] position = convertSlotToPosition(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
    public static int[] convertSlotToPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }
}
