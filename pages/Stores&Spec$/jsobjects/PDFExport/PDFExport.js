export default {
	generatePDF: async () => {
		const tableData = Store_table.tableData; // Replace with your table widget name
		let htmlContent = "Column1 Column2
		"; // Add your table headers
		tableData.forEach(row => {
			htmlContent += `<b>${row.Store Code} ${row.Store Name}<br>`;
	//**${row.column1} ${row.column2}
//**; // Add your table data
});
htmlContent += "
";
await Api1.run({
	body: {
		html: htmlContent
	}
}).then((response) => {
	download(response.data, "tableData.pdf", "application/pdf");
});
}
}
};
