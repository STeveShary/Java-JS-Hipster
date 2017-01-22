var assert = require('assert');
var request = require('supertest');
var app = require('../src/app.js');

describe('Web Application', function() {
    describe('Hello World', function() {
        it('should return OK with body for slash', function(done) {
            request(app)
                .get('/')
                .expect('Hello World!')
                .expect(200, done);
        });
    });
});