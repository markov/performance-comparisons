package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_176 {
    private val production = Production29_176("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}