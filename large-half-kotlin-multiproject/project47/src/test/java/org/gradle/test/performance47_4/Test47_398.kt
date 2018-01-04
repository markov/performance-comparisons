package org.gradle.test.performance47_4

import org.junit.Assert.*

class Test47_398 {
    private val production = Production47_398("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
