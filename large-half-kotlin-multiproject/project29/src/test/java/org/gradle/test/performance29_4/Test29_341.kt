package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_341 {
    private val production = Production29_341("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}