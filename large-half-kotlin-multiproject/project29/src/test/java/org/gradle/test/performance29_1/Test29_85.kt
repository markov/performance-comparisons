package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_85 {
    private val production = Production29_85("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}