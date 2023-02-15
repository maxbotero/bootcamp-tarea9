package poo.coninterfaces;
public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Desde el método save");
    }

    @Override
    public void delete() {
        System.out.println("Desde el método delete");
    }

    @Override
    public void findAll() {
        System.out.println("Desde el método findAll");
    }
}
