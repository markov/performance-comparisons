package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_360 {
    private val production = Production1_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}