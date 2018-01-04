package org.gradle.test.performance29_5

import org.junit.Assert.*

class Test29_498 {
    private val production = Production29_498("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}