const assert = require('assert');
const request = require('supertest');
const app = require('../src/app.js');

describe('Hello World Web Application', () => {

    it('should return OK with body for slash', (done) => {
        request(app)
            .get('/')
            .expect('Hello World!')
            .expect(200, done);
    });
});