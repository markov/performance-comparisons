package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_358 {
    private val production = Production29_358("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}