package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_80 {
    private val production = Production47_80("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
