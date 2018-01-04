package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_79 {
    private val production = Production29_79("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}