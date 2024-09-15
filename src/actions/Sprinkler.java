package actions;

public class Sprinkler implements Action{
    boolean activate;
    @Override
    public void activateResponse() {
        this.setActivate(true);
    }

    @Override
    public void deactivateResponse() {
        this.setActivate(false);
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
