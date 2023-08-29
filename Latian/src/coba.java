import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class coba {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/healthcare";
        String username = "root";
        String password = "";

        int pa = 7829123;
        // SQL query to retrieve image data from the database
        String sql = "SELECT image FROM tb_karyawan WHERE id_karyawan = ?";

        // Create a new JFrame
        JFrame frum = new JFrame("Image Label Example");
        frum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new JLabel
        JLabel label = new JLabel();

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Set the image ID parameter
            statement.setInt(1, pa); // Replace 1 with the actual image ID

            // Execute the query and retrieve the image data
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Retrieve the image data as a byte array
                    byte[] imageData = resultSet.getBytes("image");

                    // Create an ImageIcon from the image data
                    ImageIcon icon = new ImageIcon(imageData);

                    // Set the icon for the label
                    label.setIcon(icon);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // Add the label to the frame
        frum.getContentPane().add(label);

        // Adjust the frame size
        frum.pack();

        // Make the frame visible
        frum.setVisible(true);
    }
}