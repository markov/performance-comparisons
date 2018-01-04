package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_289 {
    private val production = Production47_289("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
