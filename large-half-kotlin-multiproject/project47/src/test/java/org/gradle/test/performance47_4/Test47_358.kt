package org.gradle.test.performance47_4

import org.junit.Assert.*

class Test47_358 {
    private val production = Production47_358("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
