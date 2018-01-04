package org.gradle.test.performance47_5

import org.junit.Assert.*

class Test47_421 {
    private val production = Production47_421("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
