package model;

public class Department {
		private String DepartmentName;

		public String getDepartmentName() {
			return DepartmentName;
		}

		public void setDepartmentName(String departmentName) {
			DepartmentName = departmentName;
		}

		@Override
		public String toString() {
			return "Department [DepartmentName=" + DepartmentName + "]";
		}
		
		
}
