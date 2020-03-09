<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//Dth XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/Dth/xhtml1-strict.dth">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
	<head>
		<title>Student Roster</title>
	</head>
	<body>
		<div>Student Roster</div>
		<form action="/searchForm" method="get">
			<label for="rosterSearch">Search Roster</label>
			<select id="rosterSearch" type="file" name="rosterFile">
				<option>School Year</option>
				<option>Campus</option>
				<option>Student ID</option>
				<option>Entry Date</option>
				<option>Grade Level</option>
				<option>Name</option>
			</select>
			<input id="searchField" type="text"/>
			<input id="submitSearch" type="submit" value="Search" />
		</form>
		<table>
			<thead>
				<th>School Year</th>
				<th>Campus</th>
				<th>Student ID</th>
				<th>Entry Date</th>
				<th>Grade Level</th>
				<th>Name</th>
			</thead>
			<tr>
				<td>School Year</td>
				<td>Campus</td>
				<td>Student ID</td>
				<td>Entry Date</td>
				<td>Grade Level</td>
				<td>Name</td>
			</tr>
			<tfoot>
				<td>School Year</td>
				<td>Campus</td>
				<td>Student ID</td>
				<td>Entry Date</td>
				<td>Grade Level</td>
				<td>Name</td>
			</tfoot>
		</table>
		<form action="/upoadForm" enctype="multipart/form-data" method="post">
			<label for="rosterUpload">Upload Roster</label>
			<input id="rosterUpload" type="file" name="rosterFile"/>
			<input id="submitUpload" type="submit" value="Upload" />
		</form>
	</body>
</html>