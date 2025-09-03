
#New data
from sqlalchemy import create_engine, Column, Integer, String
from sqlalchemy.orm import declarative_base, sessionmaker
from sqlalchemy import inspect

# Set up the database engine and echo SQL
engine = create_engine('sqlite:///example.db', echo=True)

# Define base and model
Base = declarative_base()

class User(Base):
    __tablename__ = 'users'
    
    id = Column(Integer, primary_key=True)
    name = Column(String)
    age = Column(Integer)

    def __repr__(self):
        return f"<User(name={self.name}, age={self.age})>"

# Create the tables
Base.metadata.create_all(engine)

# Using inspect for table names in SQLAlchemy 2.0+
inspector = inspect(engine)
print("Tables created:", inspector.get_table_names())

# Set up a session
Session = sessionmaker(bind=engine)
session = Session()

# Add and commit a new user
new_user = User(name="Alice", age=25)
session.add(new_user)
session.commit()
print("New user added:", new_user)

# Query and display all users
users = session.query(User).all()
print("All users in database:")
for user in users:
    print(user)


