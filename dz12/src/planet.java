enum planet {
    mercury(3, 2440),
    venus(41,6052),
    earth(60,6378),
    mars(6, 3397),
    jupiter(20000,71490),
    saturn(5000,60270),
    uranus(800,25560),
    neptune(1000,24760);
    public int mass;
    public int radius;
    planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }
}