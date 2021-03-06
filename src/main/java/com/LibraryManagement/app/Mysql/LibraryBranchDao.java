package com.LibraryManagement.app.Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LibraryManagement.app.Dao.ILibraryBranchDao;
import com.LibraryManagement.app.Entity.LibraryBranch;

public class LibraryBranchDao implements ILibraryBranchDao {

	public List<LibraryBranch> findAll(Connection conn) {
		List<LibraryBranch> libraryBranchList = new ArrayList<>();

		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		LibraryBranch libraryBranch;
		String sqlQuery = "SELECT * FROM `tbl_library_branch`;";
		try {
			prepareStatement = conn.prepareStatement(sqlQuery);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				libraryBranch = new LibraryBranch();
				libraryBranch.setLibraryBranchId(resultSet.getInt("branchId"));
				libraryBranch.setLibraryBranchName(resultSet.getString("branchName"));
				libraryBranch.setLibraryBranchAddress(resultSet.getString("branchAddress"));
				libraryBranchList.add(libraryBranch);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libraryBranchList;
	}

	@Override
	public boolean addLibraryBranch(Connection conn, LibraryBranch libraryBranch) {
		// TODO Auto-generated method stub
		PreparedStatement prepareStatement = null;
		boolean reply = false;
		int replyInt = 0;
		String sqlQuery = "INSERT INTO `lms`.`tbl_library_branch` (`branchId`, `branchName`, `branchAddress`) VALUES (?, ?, ?);";
		try {
			prepareStatement = conn.prepareStatement(sqlQuery);
			prepareStatement.setInt(1, libraryBranch.getLibraryBranchId());
			prepareStatement.setString(2, libraryBranch.getLibraryBranchName());
			prepareStatement.setString(3, libraryBranch.getLibraryBranchAddress());
			replyInt = prepareStatement.executeUpdate();
			if (replyInt == 1) {
				reply = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reply;
	}

	@SuppressWarnings("null")
	public List<LibraryBranch> getLibraryBranchById(Connection conn, int branchId) {
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		String sqlQuery = "SELECT * FROM `lms`.`tbl_library_branch` WHERE `lms`.`tbl_library_branch`.`branchId` = ?;";
		LibraryBranch libraryBranch;
		List<LibraryBranch> libraryBranchList = null;
		try {
			prepareStatement = conn.prepareStatement(sqlQuery);
			prepareStatement.setInt(1, branchId);
			System.out.println(prepareStatement.executeUpdate());
			while (resultSet.next()) {
				libraryBranch = new LibraryBranch();
				libraryBranch.setLibraryBranchId(resultSet.getInt("branchId"));
				libraryBranch.setLibraryBranchName(resultSet.getString("branchName"));
				libraryBranch.setLibraryBranchAddress(resultSet.getString("branchAddress"));
				libraryBranchList.add(libraryBranch);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libraryBranchList;
	}

	@SuppressWarnings("null")
	public LibraryBranch getLibraryBranchByIdReturn(Connection conn, int branchId) {
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		String sqlQuery = "SELECT * FROM `lms`.`tbl_library_branch` WHERE `lms`.`tbl_library_branch`.`branchId` = ?;";
		LibraryBranch libraryBranch = null;
		try {
			prepareStatement = conn.prepareStatement(sqlQuery);
			prepareStatement.setInt(1, branchId);
			System.out.println(prepareStatement.executeUpdate());
			while (resultSet.next()) {
				libraryBranch = new LibraryBranch();
				libraryBranch.setLibraryBranchId(resultSet.getInt("branchId"));
				libraryBranch.setLibraryBranchName(resultSet.getString("branchName"));
				libraryBranch.setLibraryBranchAddress(resultSet.getString("branchAddress"));
				return libraryBranch;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libraryBranch;
	}

	public boolean updateLibraryBranch(Connection conn, LibraryBranch libraryBranch) {
		PreparedStatement prepareStatement = null;
		boolean reply = false;
		int replyInt = 0;
		String sqlQuery = "UPDATE `lms`.`tbl_library_branch` SET `branchName` = ?, `branchAddress` = ? WHERE (`branchId` = ?);";
		try {
			prepareStatement = conn.prepareStatement(sqlQuery);

			prepareStatement.setString(1, libraryBranch.getLibraryBranchName());
			prepareStatement.setString(2, libraryBranch.getLibraryBranchAddress());
			prepareStatement.setInt(3, libraryBranch.getLibraryBranchId());

			replyInt = prepareStatement.executeUpdate();
			if (replyInt == 1) {
				reply = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reply;
	}

	public boolean deleteLibraryBranchById(Connection conn, LibraryBranch libraryBranch) {
		PreparedStatement prepareStatement = null;
		boolean reply = false;
		int replyInt = 0;
		String sqlQuery = "DELETE FROM `lms`.`tbl_library_branch` WHERE `lms`.`tbl_library_branch`.`branchId` = ?;";
		try {
			prepareStatement = conn.prepareStatement(sqlQuery);
			prepareStatement.setInt(1, libraryBranch.getLibraryBranchId());
			replyInt = prepareStatement.executeUpdate();
			if (replyInt == 1) {
				reply = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reply;
	}

	@SuppressWarnings("null")
	public List<LibraryBranch> getSingleLibraryBranch(Connection conn, int count) {
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		LibraryBranch libraryBranch = null;
		List<LibraryBranch> libraryBranchList = null;
		String sqlQuery = "SELECT * FROM `lms`.`tbl_library_branch` LIMIT ?, 1;";
		try {
			prepareStatement = conn.prepareStatement(sqlQuery);
			prepareStatement.setInt(1, count - 1);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				libraryBranch = new LibraryBranch();
				libraryBranch.setLibraryBranchId(resultSet.getInt("branchId"));
				libraryBranch.setLibraryBranchName(resultSet.getString("branchName"));
				libraryBranch.setLibraryBranchAddress(resultSet.getString("branchAddress"));
				libraryBranchList.add(libraryBranch);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libraryBranchList;
	}

}
