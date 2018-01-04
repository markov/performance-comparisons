package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_217 {
    private val production = Production47_217("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
