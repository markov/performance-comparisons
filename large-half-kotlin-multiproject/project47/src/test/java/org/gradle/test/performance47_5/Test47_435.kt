package org.gradle.test.performance47_5

import org.junit.Assert.*

class Test47_435 {
    private val production = Production47_435("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
