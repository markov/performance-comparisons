package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_329 {
    private val production = Production29_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}