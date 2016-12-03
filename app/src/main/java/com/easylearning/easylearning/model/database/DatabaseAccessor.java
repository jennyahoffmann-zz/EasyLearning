package com.easylearning.easylearning.model.database;

import android.content.Context;

import com.easylearning.easylearning.model.Chunk;
import com.easylearning.easylearning.model.Course;
import com.easylearning.easylearning.model.DaoMaster;
import com.easylearning.easylearning.model.DaoMaster.DevOpenHelper;
import com.easylearning.easylearning.model.DaoSession;
import com.easylearning.easylearning.model.Lesson;
import com.easylearning.easylearning.model.Quiz;
import com.easylearning.easylearning.model.Topic;
import com.easylearning.easylearning.model.Unit;

import org.greenrobot.greendao.database.Database;

/**
 * Created by Malcolm-X on 03.12.2016.
 * This class is used to access data in the database.
 */

public class DatabaseAccessor {

    Context context;
    Database db;
    DevOpenHelper helper;
    DaoMaster master;
    DaoSession session;

    public DatabaseAccessor(Context context, String dbName) {
        this.context = context;
        setupDb(dbName);
    }

    private void setupDb(String dbName) {
        this.helper = new DevOpenHelper(context, dbName);
        this.db = helper.getWritableDb();
        this.master = new DaoMaster(db);
        this.session = master.newSession();
    }

    public long store(Object o) {
        if (o instanceof Course) return storeCourse((Course) o);
        else if (o instanceof Quiz) {
            return storeQuiz((Quiz) o);
        } else if (o instanceof Topic) {
            return storeTopic((Topic) o);
        } else if (o instanceof Chunk) {
            return storeChunk((Chunk) o);
        } else if (o instanceof Lesson) {
            return storeLesson((Lesson) o);
        } else if (o instanceof Unit) {
            return storeUnit((Unit) o);
        } else {
            return -1;
        }
    }

    public long storeUnit(Unit o) {
        return session.getUnitDao().insert(o);
    }

    public long storeLesson(Lesson o) {
        return session.getLessonDao().insert(o);
    }

    public long storeChunk(Chunk o) {
        return session.getChunkDao().insert(o);
    }

    public long storeTopic(Topic o) {
        return session.getTopicDao().insert(o);
    }

    public long storeQuiz(Quiz o) {
        return session.getQuizDao().insert(o);
    }

    public long storeCourse(Course o) {
        return session.getCourseDao().insert(o);
    }
}
