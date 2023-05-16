package homework;

import freemarker.template.TemplateException;
import homework.commands.*;
import homework.exceptions.CommandException;
import homework.exceptions.InitializationException;
import homework.items.*;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, TemplateException, URISyntaxException, CommandException,
            InitializationException {
        Catalog catalog = new Catalog("Catalog");

        new AddCommand().execute(catalog, new Item("Cat1", "Advanced Programming", "C:\\Users\\Victor\\OneDrive\\Desktop\\TW"));
        new AddCommand().execute(catalog, new Item("Cat2", "Algorithm Design", "https://www.uaic.ro/"));

        new ListCommand().execute(catalog);

        new ViewCommand().execute(catalog.getItem(1));
        new ViewCommand().execute(catalog.getItem(0));

        new SaveCommand().execute(catalog);

        Catalog catalog2 = new LoadCommand().execute();
        new ListCommand().execute(catalog2);

        new ReportCommand().execute(catalog);

    }
}
