package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_195 {
    private val production = Production47_195("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
