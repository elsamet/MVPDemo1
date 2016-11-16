package Presenter;

import Model.User;

/**
 * Created by Mahmoud.Ramadan on 11/15/2016.
 */

public class MainPresenter {

   private TextViewUpdater view;
   private  User user;

   public MainPresenter(TextViewUpdater view){
        this.view=view;
        this.user=new User();
    }

    public void updateFullName(String fullName){
        user.setFullName(fullName);
         view.updateTextView(fullName);

    }

    public void updateEmail(String email){
       user.setEmail(email);
        view.updateTextView(email);
    }

    public interface  TextViewUpdater{
        void updateTextView(String info);
    }

}
