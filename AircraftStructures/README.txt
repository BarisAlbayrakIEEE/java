This library is designed to be a framework for all stress analysis of the structures.
The framework will have a Finite Element (FE) interface which is a must in structural analysis.

The current java files/classes in the repository is just for demonstration. Besides, some of them are even INCOMPLETE! Soon, will be completed.

The final product will be a hybrid framework supporting C++, Java and Python.
The built-in type definitions will be implemented with C/C++ for a robust memory management.
Stress analysis methods will be implemented in Python and the GUIs will be implemented with Java
  as the engineers in (especially automotive and aerospace industries) are more familier with these two languages rather than C++.
Wrapper classes will be implemented for Java and Python for the built-in C++ types.





The workflow to run analyses in the framework is as follows:
1. (USER) Import an FE model
    1.1. Executes pynastran library methods to import the FE data
    1.2. Runs a machine learning algorithm (python tensorflow library)
        in order to classify the components (e.g. ribs and skins for aerospace industries) and
        the engineering objects (e.g. panels, stiffeners, etc.)
    1.3. Gets the material, geometry and loading for each engineering object from element properties, nodal locations and loads (pynastran)
    1.4. Creates each component and engineering object using factory method pattern
2. (USER) Review the FE data of each engineering object and correct with DB data (e.g. material definitions in the FE are generally wrong or incomplete)
3. (USER) Run analysis for each engineering object.

