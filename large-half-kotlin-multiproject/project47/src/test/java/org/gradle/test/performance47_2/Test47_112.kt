package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_112 {
    private val production = Production47_112("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
