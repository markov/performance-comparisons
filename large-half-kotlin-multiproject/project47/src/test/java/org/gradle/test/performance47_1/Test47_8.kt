package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_8 {
    private val production = Production47_8("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
