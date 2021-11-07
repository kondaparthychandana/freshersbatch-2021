public class singleton {

		String Name;

		private static singleton s;

		private singleton() {

			Name = "hello";

		}

		static singleton getInstance() {

		if (s == null)

		s = new singleton();

		return s;

		}

		}

