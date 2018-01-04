package org.gradle.test.performance29_3

import org.junit.Assert.*

class Test29_264 {
    private val production = Production29_264("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}